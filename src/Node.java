import java.util.Optional;

public record Node (String NodeA, String NodeB, Optional<Integer> Weight){
    @Override
    public String toString() {
        var connection = NodeA+" to "+NodeB;
        if(Weight.isPresent()){
            connection = connection+" with weight: "+Weight.get();
        }
        return connection;
    }
}
