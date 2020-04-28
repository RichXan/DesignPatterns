package menento;

public class Originator {
    private String state;

    public String getState(){
        return this.state;
    }

    public void setState(String state){
    	this.state = state;
    }

    public Memento setStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMenmento(Memento Memento){
    	state = Memento.getState();
    }

}
