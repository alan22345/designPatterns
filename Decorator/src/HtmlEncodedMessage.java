import java.beans.Encoder;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message{
    private Message msg;

    public HtmlEncodedMessage(Message msg){
        this.msg = msg;
    }
    @Override
    public String getContent() {
        //example code shouldve used another encoder but it didnt import
        //return Encoder.encode(msg.getContent());
        return null;
    }
}
