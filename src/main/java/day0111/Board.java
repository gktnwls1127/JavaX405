package day0111;

public class Board {
    private int id;
    private String title;
    private String writer;
    private String content;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void printBoard(){
        // 게시글 개별 출력을 위해서 외부에서 꼭 알아야한다.
        System.out.println("-------------------------------------");
        System.out.println(title);
        System.out.println("-------------------------------------");
        System.out.println("글번호 : " + id);
        System.out.println("작성자 : " + writer);
        System.out.println("-------------------------------------");
        System.out.println(content);
    }

    public boolean equals(Object o){
        if (o instanceof Board){
            // 게시글이 같은지 확인 하기위해서 외부에서 꼭 알아야한다.
            Board b = (Board) o;
            return id == b.id;
        }
        return false;
    }
}
