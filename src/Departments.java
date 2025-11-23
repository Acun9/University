public enum Departments {

    SOFTWARE_ENGINEERING("Software Engineering", "Yazilim Muhendisligi"),
    COMPUTER_ENGINEERING("Computer Engineering", "Bilgisayar Muhendisligi"),
    INDUSTRIAL_ENGINEERING("Industrial Engineering", "Endustri Muhendisligi"),
    ARCHITECTURE("Architecture", "Mimarlik"),
    LANDSCAPE_ARCHITECTURE("Landscape Architecture", "Peyzaj Muhendisligi");

    private String englishName;
    private String turkishName;

    Departments(String englishName, String turkishName){

        this.englishName = englishName;
        this.turkishName = turkishName;
    }

    public String getEnglishName(){

        return this.englishName;
    }

    public String getTurkishName(){

        return this.turkishName;
    }
}
