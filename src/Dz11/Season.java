package Dz11;

public enum Season {
    WINTER(-5),
    SPRING(13),
    SUMMER(30),
    AUTUMN(9);
    private int averageTemperature;
    private String description;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;

    }

    Season(String description) {
        this.description = description;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
