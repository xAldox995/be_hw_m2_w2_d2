package aldovalzani.be_hw_m2_w2_d2.payloads;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BlogPostPL {
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;

    public BlogPostPL(String categoria, String contenuto, int tempoDiLettura, String titolo) {
        this.categoria = categoria;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        this.titolo = titolo;
    }
}
