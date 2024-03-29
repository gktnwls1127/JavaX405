package model;

import java.util.Date;

public class ReplyDTO {
    private int id;
    private String content;
    private int boardId;
    private int writerId;
    private String writerNickname;

    private Date entryDate;
    private Date modifyDate;

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public String getWriterNickname() {
        return writerNickname;
    }

    public void setWriterNickname(String writerNickname) {
        this.writerNickname = writerNickname;
    }

    public ReplyDTO(){

    }

    public ReplyDTO(ReplyDTO original){
        this.id = original.id;
        this.content = original.content;
        this.boardId = original.boardId;
        this.writerId = original.writerId;
        this.writerNickname = original.writerNickname;
        this.entryDate = original.entryDate;
        this.modifyDate = original.modifyDate;

    }

    public boolean equals(Object o){
        if (o instanceof ReplyDTO){
            ReplyDTO r = (ReplyDTO) o;
            return id == r.id;
        }
        return false;
    }

    public ReplyDTO(int id){
        this.id = id;
    }


}
