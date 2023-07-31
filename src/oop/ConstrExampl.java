package oop;

public class ConstrExampl {

    private String name;

    // if this  no cotructor is added by yoursleft that java AUTOMATICALY generates a defautl contructor
    // if any non-default contructor is added, then java WILL NOT generate default
//    public ConstrExampl() {
//
//    }
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
        ConstrExampl constrExampl = new ConstrExampl();
    }
}
