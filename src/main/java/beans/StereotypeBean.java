package beans;

import org.springframework.stereotype.Component;

@Component
public class StereotypeBean {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
