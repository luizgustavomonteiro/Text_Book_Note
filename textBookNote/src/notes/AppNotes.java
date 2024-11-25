package notes;

public class AppNotes implements NotesInterface {

    @Override
    public void setNote(int note_id, String noteTitle, String noteText, String noteDate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getNoteById(int note_id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getNoteByDate(String noteDate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String updateNoteById(int note_id, String newNoteText) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String updateNoteByTitle(String noteTitle) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateNoteByDate(String noteDate, String nowNoteText) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listNotes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteNoteById(int note_id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteNoteByName(String noteTitle) {
        throw new UnsupportedOperationException("Not supported yet.");
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
