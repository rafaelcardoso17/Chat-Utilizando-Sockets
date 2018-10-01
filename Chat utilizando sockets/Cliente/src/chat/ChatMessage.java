package chat;




import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ChatMessage implements Serializable {
    
    private String name;
    private String text;
    private String nameReserved;
    private Set<String> setOnlines = new HashSet<>();
    private Action action;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    Date data= new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNameReserved() {
        return nameReserved;
    }

    public void setNameReserved(String nameReserved) {
        this.nameReserved = nameReserved;
    }

    public Set<String> getSetOnlines() {
        return setOnlines;
    }

    public void setSetOnlines(Set<String> setOnlines) {
        this.setOnlines = setOnlines;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
        
    public enum Action {
        CONNECT, DISCONNECT, SEND_ONE, SEND_ALL, USERS_ONLINE
    }
}
