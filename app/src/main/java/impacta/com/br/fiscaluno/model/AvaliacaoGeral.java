package impacta.com.br.fiscaluno.model;

/**
 * Created by a.ricarti on 16/05/2017.
 */

public class AvaliacaoGeral {

    private Integer id;
    private String descricao;
    private Double nota;
    private Aluno nome;
    private Instituicao instituicao;
    private String curso;
    private String data;

    public AvaliacaoGeral() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Aluno getNome() {
        return nome;
    }

    public void setNome(Aluno nome) {
        this.nome = nome;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
