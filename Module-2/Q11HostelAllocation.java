class Room {
    private String roomNumber;
    private String block;
    private String type;

    Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber +
                " " + block + " " + type;
    }
}

class Student {
    private String name;
    private int roll;
    private String course;
    private Room room;

    Student(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                " (" + roll + ") " + course +
                "\n" + room;
    }
}

public class Q11HostelAllocation {
    public static void main(String[] args) {

        Room room =
                new Room("A101", "Block-B", "Single");

        Student student =
                new Student("Ravi", 101, "CSE", room);

        System.out.println(student);
    }
}