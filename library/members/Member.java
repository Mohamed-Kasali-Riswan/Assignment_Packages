package library.members;

public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Member Name: " + name + ", ID: " + memberId);
    }
}
