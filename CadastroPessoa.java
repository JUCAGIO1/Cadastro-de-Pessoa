import javax.swing.*;
import java.awt.*;

public class CadastroPessoa extends JFrame {

    // Fontes e cores
    private final Font fonteLabels = new Font("Arial", Font.BOLD, 12);
    private final Font fonteCampos = new Font("Arial", Font.PLAIN, 12);
    //private final Color corLabel = new Color(255, 102, 0);  // Laranja
    private final Color corCampo = Color.WHITE;

    // Componentes
    private JComboBox<String> comboTipo;
    private JTextField txtCpfCnpj, txtNome, txtRgIe, txtOrgaoExp, txtEmail, txtCep;
    private JTextField txtPais, txtUf, txtMunicipio, txtLogradouro, txtNumero;
    private JTextField txtComplemento, txtBairro, txtTelefone, txtSituacao;
    private JCheckBox chkFornecedor;
    private JRadioButton rbAtivo, rbInativo;
    private JButton btnConfirmar, btnExcluir, btnLimpar;

    public CadastroPessoa() {
        super("Cadastro de Pessoa");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 1
        gbc.gridx = 0; gbc.gridy = 0;
        painel.add(criarLabel("Tipo"), gbc);
        gbc.gridx = 1;
        comboTipo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        comboTipo.setFont(fonteCampos);
        painel.add(comboTipo, gbc);

        gbc.gridx = 2;
        painel.add(criarLabel("CPF / CNPJ"), gbc);
        gbc.gridx = 3;
        txtCpfCnpj = criarCampo(15);
        painel.add(txtCpfCnpj, gbc);
        gbc.gridx = 4; 
        painel.add(criarLabel("Fornecedor"), gbc);
        gbc.gridx = 5;
        chkFornecedor = new JCheckBox();
        painel.add(chkFornecedor, gbc);



        // Linha 2
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Nome"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 1;
        txtNome = criarCampo(30);
        painel.add(txtNome, gbc);
        gbc.gridwidth = 1;

        // Linha 3
        gbc.gridx = 2;
        painel.add(criarLabel("RG / Inscrição Estadual"), gbc);
        gbc.gridx = 3;
        txtRgIe = criarCampo(15);
        painel.add(txtRgIe, gbc);

        // Linha 4
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Órgão Expedidor"), gbc);
        gbc.gridx = 1;
        txtOrgaoExp = criarCampo(15);
        painel.add(txtOrgaoExp, gbc);


        // Linha 5
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Email"), gbc);
        gbc.gridx = 1;
        txtEmail = criarCampo(20);
        painel.add(txtEmail, gbc);

        gbc.gridx = 2;
        painel.add(criarLabel("CEP"), gbc);
        gbc.gridx = 3;
        txtCep = criarCampo(10);
        painel.add(txtCep, gbc);

        gbc.gridx = 2;
        painel.add(criarLabel("País"), gbc);
        gbc.gridx = 3;
        txtPais = criarCampo(10);
        txtPais.setText("BRASIL");
        txtPais.setEditable(false);
        painel.add(txtPais, gbc);

        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("UF"), gbc);
        gbc.gridx = 1;
        txtUf = criarCampo(5);
        painel.add(txtUf, gbc);

        // Linha 6
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Município"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 3; //tirar gridwidth caso dê erro
        txtMunicipio = criarCampo(15);
        painel.add(txtMunicipio, gbc);


        // Linha 7
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Logradouro"), gbc);
        gbc.gridx = 1;
        txtLogradouro = criarCampo(20);
        painel.add(txtLogradouro, gbc);

        // Linha 8
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Número"), gbc);
        gbc.gridx = 1;
        txtNumero = criarCampo(5);
        painel.add(txtNumero, gbc);

        gbc.gridx = 2;
        painel.add(criarLabel("Complemento"), gbc);
        gbc.gridx = 3;
        txtComplemento = criarCampo(10);
        painel.add(txtComplemento, gbc);

        // Linha 9
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Bairro"), gbc);
        gbc.gridx = 1;
        txtBairro = criarCampo(10);
        painel.add(txtBairro, gbc);

        gbc.gridx = 2;
        painel.add(criarLabel("Telefone"), gbc);
        gbc.gridx = 3;
        txtTelefone = criarCampo(10);
        painel.add(txtTelefone, gbc);

        // Linha 10
        gbc.gridx = 0; gbc.gridy++;
        painel.add(criarLabel("Situação"), gbc);
        gbc.gridx = 1;
        txtSituacao = criarCampo(10);
        painel.add(txtSituacao, gbc);

        gbc.gridx = 2;
        rbAtivo = new JRadioButton("Ativo");
        rbAtivo.setSelected(true);
        painel.add(rbAtivo, gbc);

        gbc.gridx = 3;
        rbInativo = new JRadioButton("Inativo");
        painel.add(rbInativo, gbc);

        ButtonGroup grupoSituacao = new ButtonGroup();
        grupoSituacao.add(rbAtivo);
        grupoSituacao.add(rbInativo);

        // Linha 11 - Botões
        gbc.gridx = 0; gbc.gridy++;
        btnLimpar = new JButton("Limpar");
        painel.add(btnLimpar, gbc);

        gbc.gridx = 1;
        btnConfirmar = new JButton("Confirmar");
        painel.add(btnConfirmar, gbc);

        gbc.gridx = 2;
        btnExcluir = new JButton("Excluir");
        painel.add(btnExcluir, gbc);

        add(painel);

        // Ações
        btnLimpar.addActionListener(e -> limparCampos());

        btnConfirmar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!"));

        btnExcluir.addActionListener(e -> JOptionPane.showMessageDialog(this, "Cadastro excluído!"));
    }

    // Métodos auxiliares
    private JLabel criarLabel(String texto) {
        JLabel label = new JLabel(texto);
        label.setFont(fonteLabels);
       // label.setForeground(corLabel);
        return label;
    }

    private JTextField criarCampo(int colunas) {
        JTextField campo = new JTextField(colunas);
        campo.setFont(fonteCampos);
        campo.setBackground(corCampo);
        return campo;
    }

    private void limparCampos() {
        txtCpfCnpj.setText("");
        txtNome.setText("");
        txtRgIe.setText("");
        txtOrgaoExp.setText("");
        txtEmail.setText("");
        txtCep.setText("");
        txtPais.setText("BRASIL");
        txtUf.setText("");
        txtMunicipio.setText("");
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtTelefone.setText("");
        txtSituacao.setText("");
        chkFornecedor.setSelected(false);
        rbAtivo.setSelected(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroPessoa().setVisible(true));
    }
}
