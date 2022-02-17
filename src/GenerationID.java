public class GenerationID {
    private static Long IdCount;
    public Long generateId(){
        return IdCount++;
    }
}
