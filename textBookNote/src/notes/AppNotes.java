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
    
}