package notes;

public interface NotesInterface {

    // Method to create a new note
    void setNote(int note_id, String noteTitle, String noteText, String noteDate);

    void getNoteById(int note_id);

    void getNoteByDate(String noteDate);

    String updateNoteById(int note_id, String newNoteText);

    String updateNoteByTitle(String noteTitle);

    void updateNoteByDate(String noteDate, String nowNoteText);

    void listNotes();

    boolean deleteNoteById(int note_id);

    boolean deleteNoteByName(String noteTitle);
    
}
