package oop;

public class ConstrExampl {

    private String name;

    // if this  no cotructor is added by yoursleft that java AUTOMATICALY generates a default contractor
    // if any non-default contructor is added, then java WILL NOT generate default
    public ConstrExampl() {
        System.out.println("ConstrExampl is called");
    }
//
//    public ConstrExampl(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SubConstrExampl constrExampl = new SubConstrExampl();
    }
}
