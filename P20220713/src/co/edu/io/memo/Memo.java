package co.edu.io.memo;

import java.io.Serializable;

// 메모번호, 날짜시간, 메모내용
public class Memo implements Serializable {
    private int num;
    private String date;
    private String content;

    public Memo() {}

    public Memo(int num, String date, String content) {
        this.num = num;
        this.date = date;
        this.content = content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "- [ ★num: " + num +
                ", ★date: " + date +
                ", ★content: " + content + "]";
    }
}
