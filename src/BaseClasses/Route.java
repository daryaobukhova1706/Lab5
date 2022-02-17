package BaseClasses;

public class Route implements Comparable {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private LocationFrom from; //Поле может быть null
    private LocationTo to; //Поле может быть null
    private Long distance; //Поле может быть null, Значение поля должно быть больше 1
    Route(Long id, String name, Coordinates coordinates, LocationFrom from, LocationTo to, Long distance){
        this.id=id;
        this.name=name;
        this.coordinates=coordinates;
        this.from=from;
        this.to=to;
        this.distance=distance;

    }
    @Override
    public int compareTo(Object o){
        Route route= (Route) o;
        int result= this.name-Route.name;
        return result;
    }
    public void setId(){

    }
    public Long getId(){
        return
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public void setCoordinate(Coordinates coordinates){
        this.coordinates=coordinates;
    }
    public Coordinates getCoordinate(Coordinates coordinates){
        return coordinates;
    }
    public void setFrom(LocationFrom from){
        this.from=from;
    }
    public LocationFrom getFrom(LocationFrom from){
        return from;
    }
    public void setTo(LocationTo to){
        this.to=to;
    }
    public LocationTo getTo(LocationTo to){
        return to;
    }
    public void setDistance (Long distance){
        this.distance=distance;
    }
    public Long getDistance(Long distance){
        return distance;
    }


}