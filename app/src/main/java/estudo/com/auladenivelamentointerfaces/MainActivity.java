package estudo.com.auladenivelamentointerfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Cliente objCliente;
    Produto objProduto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente();
        objProduto=new Produto();

        objCliente.setNome("Tiago");
        objCliente.setEmail("teste@teste");

        objProduto.setNome("HD SSD 1 tb");
        objProduto.setFornecedor("DELL");

        objCliente.incluir();

        objProduto.deletar();
        objProduto.listar();
    }
}