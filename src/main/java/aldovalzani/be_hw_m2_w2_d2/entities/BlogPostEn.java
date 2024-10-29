package aldovalzani.be_hw_m2_w2_d2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BlogPostEn {
    private static int counterId = 1;
    private int id;
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;
    private String cover;

    public BlogPostEn(String categoria, String contenuto, int tempoDiLettura, String titolo) {
        this.categoria = categoria;
        this.contenuto = contenuto;
        this.cover = "https://picsum.photos/200/300";
        this.id = counterId++;
        this.tempoDiLettura = tempoDiLettura;
        this.titolo = titolo;
    }
}
