import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrndenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrndenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adiconarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}
