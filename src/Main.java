import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.Endereco;
import com.petland.domain.cadastro.Perfil;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.setId(1);
        cadastro.setNome("Lucas Rodrigues");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        cadastro.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua plinio pereira");
        endereco.setNumero("77");
        cadastro.setEndereco(endereco);

        System.out.println("Cadastro: "+cadastro);
    }
}