package notes;
import java.util.ArrayList;
import java.util.List;

/*
 * Using data structure such as a Lis<Note> in AppNotes to store the notes.
 */

public class AppNotes implements NotesInterface {
    private final List<Note> notes = new ArrayList<>();

    @Override
    public void setNote(int note_id, String noteTitle, String noteText, String noteDate) {
        Note note = new Note(note_id, noteTitle, noteText, noteDate);
        notes.add(note);
        System.out.println("Note added: " + note);
    }

    @Override
    public void getNoteById(int note_id) {
        for(Note note : notes) {
            if(note.getId() == note_id){
                System.out.println(note);
                return;
            }
        }
        System.out.println("Note not found with ID: " + note_id);
    }

    @Override
    public void getNoteByDate(String noteDate) {
        for(Note note : notes){
            if(note.getDate().equals(noteDate)){
                System.out.println(note);
            }
        }
    }

    @Override
    public String updateNoteById(int note_id, String newNoteText) {
        for(Note note: notes){
            if(note.getId() == note_id){
                note.setText(newNoteText);
                return "Note updated: " + note;
            }
        }
        return "Note not found with ID: " + note_id;
    }

    @Override
    public String updateNoteByTitle(String noteTitle) {
        for(Note note : notes){
            if(note.getTitle().equalsIgnoreCase((noteTitle))){
                note.setText("Updated text");
                return "Note updated: " + note;
            }
        }
        return "Note not found with title: " + noteTitle;
    }

    @Override
    public void updateNoteByDate(String noteDate, String newNoteText) {
        for(Note note: notes){
            if(note.getDate().equals(noteDate)){
                note.setText(newNoteText);
                System.out.println("Updated note:" + note);
            }
        }
    }

    @Override
    public void listNotes() {
        for(Note note : notes){
            System.out.println(note);
        }
    }

    @Override
    public boolean deleteNoteById(int note_id) {
        return notes.removeIf(note -> note.getId() == note_id);
    }

    @Override
    public boolean deleteNoteByName(String noteTitle) {
        return notes.removeIf(note -> note.getTitle().equalsIgnoreCase(noteTitle));
    }

    public class Note{
        private int id;
        private String title;
        private String text;
        private String date;

        public Note(int id, String title, String text, String date){
            this.id = id;
            this.title = title;
            this.text = text;
            this.date = date;
        }

        // Geters and Setters
        public int getId() {return id;}
        public void setId(int id) {this.id = id; }
        public String getTitle() { return title;}
        public void setTitle(String title) {this.title = title; }
        public String getText() { return text;}
        public void setText(String text) {this.text = text;}
        public String getDate() { return date;}
        public void setDate(String date) { this.date = date; }

        @Override
        public String toString(){
            return "Note{" + 
                    "id=" + id +
                    ", title='" + title + '\'' + 
                    ", text='" + text + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }

    }
    
}
