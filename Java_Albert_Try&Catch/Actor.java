public class Actor<VariableType> {
    
    private String actorName;
    private String actorOrigin;
    private VariableType actorKnownMovie;

    public void setactorKnownMovie(VariableType actorKnownMovie){
        this.actorKnownMovie=actorKnownMovie;
    }
    public VariableType getactorKnownMovie(){
        return actorKnownMovie;
    }

    public void setactorName(String actorName){
        this.actorName=actorName;
    }
    public String getactorName(){
        return actorName;
    }
    public void setactorLoveTeam(String actorLoveTeam){
        this.actorOrigin=actorLoveTeam;
    }
    public String getactorLoveTeam(){
        return actorOrigin;
    }
}
