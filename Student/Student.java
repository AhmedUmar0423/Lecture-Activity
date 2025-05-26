public class Student {
    private int stdId;
    private String name;
    private String batchId;

    public void setStdId(int stdId) {
        if(stdId > 0) {
            this.stdId = stdId;
        } else {
            System.out.println("Student ID should be greater than 0");
        }
    }

    public int getStdId() {
        return stdId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void displaydetails() {
        System.out.println("Student ID: " + getStdId());
        System.out.println("Student Name: " + getName());
        System.out.println("Student Batch ID: " + getBatchId());
    }
}
