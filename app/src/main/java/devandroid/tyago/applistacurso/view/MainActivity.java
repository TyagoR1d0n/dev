package devandroid.tyago.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.tyago.applistacurso.R;
import devandroid.tyago.applistacurso.model.Pessoa;


public class MainActivity extends AppCompatActivity {

 Pessoa pessoa;
 Pessoa outraPessoa;

 String dadosPessoa;
 String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        outraPessoa = new Pessoa();


        //atribuir dados,conteudos,valores para o objeto;
        //conforme o seu MODELO, TEMPLATE;

        pessoa.setPrimeiroNome("Tyago");
        pessoa.setSobreNome("Santana");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("92984410185");
        pessoa.setCidade("Manaus");
        pessoa.setEstado("Amazonas");

        dadosPessoa += "Nome Pessoa ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Curso Desejado ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += "Telefone para contato ";
        dadosPessoa += pessoa.getTelefoneContato();

        outraPessoa.setPrimeiroNome("Joao");
        outraPessoa.setSobreNome("Sant");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("92991123797");
        outraPessoa.setCidade("Recife");
        outraPessoa.setEstado("Pernambuco");

        dadosOutraPessoa += "Nome Pessoa";
        dadosOutraPessoa +=outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += "Sobrenome";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += "Curso Desejado";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += "Telefone contato";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

int parada = 0;

    }
}