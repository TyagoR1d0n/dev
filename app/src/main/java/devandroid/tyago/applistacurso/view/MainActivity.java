package devandroid.tyago.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.prefs.Preferences;

import devandroid.tyago.applistacurso.R;
import devandroid.tyago.applistacurso.controller.PessoaController;
import devandroid.tyago.applistacurso.model.Pessoa;


public class MainActivity extends AppCompatActivity {


    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref_ListaVip";
    PessoaController controller;
    Pessoa pessoa;
    Pessoa outraPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NOME_PREFERENCES, 0);
        SharedPreferences.Editor listaVip = preferences.edit();

        controller = new PessoaController();
        controller.toString();
        pessoa = new Pessoa();
        outraPessoa = new Pessoa();

        pessoa.setPrimeiroNome(preferences.getString("Primeiro Nome","NA"));
        pessoa.setSobreNome(preferences.getString("Sobrenome","Na"));
        pessoa.setCursoDesejado(preferences.getString("Curso Desejado","Na"));
        pessoa.setTelefoneContato(preferences.getString("Telefone Contato","Na"));



        EditText editPrimeiroNome;
        EditText editSobreNomeAluno;
        EditText editNomeCurso;
        EditText editTelefoneContato;

        Button btnLimpar;
        Button btnSalvar;
        Button btnFinalizar;


        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);


        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobreNomeAluno.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo " + pessoa.toString(), Toast.LENGTH_LONG).show();

                listaVip.putString("Primeiro Nome", pessoa.getPrimeiroNome());
                listaVip.putString("Sobrenome", pessoa.getSobreNome());
                listaVip.putString("Curso Desejado", pessoa.getCursoDesejado());
                listaVip.putString("Telefone Contato", pessoa.getTelefoneContato());
                listaVip.apply();


                controller.salvar(pessoa);

            }
        });

        Log.i("POOAndroid", "Objeto Pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto Outrapessoa:" + outraPessoa.toString());

    }
}