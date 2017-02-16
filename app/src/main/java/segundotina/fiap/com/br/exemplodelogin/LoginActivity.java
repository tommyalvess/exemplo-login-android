package segundotina.fiap.com.br.exemplodelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static segundotina.fiap.com.br.exemplodelogin.R.id.editSenha;
import static segundotina.fiap.com.br.exemplodelogin.R.id.editUsuario;
import static segundotina.fiap.com.br.exemplodelogin.R.string.usuario;

public class LoginActivity extends AppCompatActivity {

    EditText editUsuario;
    EditText editSenha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsuario = (EditText)findViewById(R.id.editUsuario);
        editSenha = (EditText)findViewById(R.id.editSenha);

    }

    public void logar (View v){

        String usuario = editUsuario.getText().toString();
        String senha = editSenha.getText().toString();

        if(usuario.toLowerCase().equals("fiap") && senha.toLowerCase().equals("fiap123")){
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it);
        }else{
            Toast.makeText(this, getString(R.string.erro), Toast.LENGTH_SHORT).show();
        }

    }

    public void cadastrar (View v){
        Intent it = new Intent(this,CadastrarActivity.class);
        startActivity(it);
    }

}
