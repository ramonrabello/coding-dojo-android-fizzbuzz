package br.com.androidnarede.dojo.fizzbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FizzbuzzActivity extends Activity {
	
	private EditText campoNumero;
	private Button botaoExibirMensagem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fizzbuzz);
		campoNumero = (EditText) findViewById(R.id.campo_numero);
		botaoExibirMensagem = (Button) findViewById(R.id.botao_exibir_mensagem);
		botaoExibirMensagem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				exibirMensagem();				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.fizzbuzz, menu);
		return true;
	}
	
	private void exibirMensagem(){
		
		if (campoNumero.getText().toString().equals("")){
			Toast.makeText(this, "Ops! Você esqueceu de informar o número!", Toast.LENGTH_SHORT).show();
		} else {
			Integer numero = Integer.parseInt(campoNumero.getText().toString());
			Toast.makeText(this, fizzBuzz(numero), Toast.LENGTH_SHORT).show();
		}
	}
	
	public String fizzBuzz(Integer numero){
		if (numero % 3 == 0 && numero % 5 != 0){
			return "Fizz!";
		} else if (numero % 5 == 0 && numero % 3 != 0){
			return "Buzz!";
		} else if (numero % 3 == 0 && numero % 5 == 0){
			return "FizzBuzz!";
		} else {
			return String.valueOf(numero);
		}
	}
}
