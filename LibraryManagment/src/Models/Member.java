package Models;

public class Member {
    private String memberName;
    private int id;

    public Member(String memberName, int id) {
        this.memberName = memberName;
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getId() {
        return id;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
