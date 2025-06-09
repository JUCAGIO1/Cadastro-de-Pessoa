import javax.swing.*;

public class FormularioSwing extends JFrame{

    private JLabel nomeLabel, senhaLabel, sexoLabel, paisLabel, fdsLabel;
    private JTextField nomeField;
    private JPasswordField senhaField;
    private JRadioButton mascRadio, femRadio;
    private ButtonGroup sexoGroup;
    private JComboBox<String> paisCombo;
    private JCheckBox termosCheck;
    private JButton enviarButton;
    private JPanel painel;
    private JPasswordField fdsField; // Adicione esta linha com os outros atributos


    public FormularioSwing(){
        super();
        inicialization();
    }

    public void inicialization(){

        painel = new JPanel();
        painel.setLayout(null);
        
        // Nome
        nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(20, 20, 100, 25);
        nomeField = new JTextField();
        nomeField.setBounds(120, 20, 200, 25);
        
        // Senha
        senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(20, 60, 100, 25);
        senhaField = new JPasswordField();
        senhaField.setBounds(120, 60, 200, 25);
        
        // Sexo
        sexoLabel = new JLabel("Sexo:");
        sexoLabel.setBounds(20, 100, 100, 25);
        mascRadio = new JRadioButton("Masculino:");
        mascRadio.setBounds(120, 100, 100, 25);
        femRadio = new JRadioButton("Masculina:");
        femRadio.setBounds(220, 100, 100, 25);
        sexoGroup = new ButtonGroup();
        sexoGroup.add(mascRadio);
        sexoGroup.add(femRadio);
        
        // Pais
        
        paisLabel = new JLabel("Pais:");
        paisLabel.setBounds(20, 140, 100, 25);
        String[] paises = {"Afeganistão", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Antígua e Barbuda", "Arábia Saudita", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Belarus", "Bélgica", "Belize", "Benim", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botswana", "Brasil", "Brunei", "Bulgária", "Burkina Faso", "Burundi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Colômbia", "Comores", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Dinamarca", "Djibouti", "Dominica", "Egito", "El Salvador", "Emirados Árabes", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Federados da Micronésia", "Estados Unidos", "Estônia", "Essuatíni", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Granada", "Grécia", "Guatemala", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Holanda", "Honduras", "Hungria", "Iémen", "Ilhas Marshall", "Ilhas Salomão", "Índia", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kiribati", "Kosovo", "Kuweit", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Liechtenstein", "Lituânia", "Luxemburgo", "Madagáscar", "Malásia", "Malawi", "Maldivas", "Mali", "Malta", "Marrocos", "Maurícia", "Mauritânia", "México", "Moldávia", "Mônaco", "Mongólia", "Montenegro", "Moçambique", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Níger", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "Palau", "Panamá", "Papua Nova Guiné", "Paquistão", "Paraguai", "Países Baixos", "Peru", "Polônia", "Portugal", "Quênia", "Quirguistão", "Reino Unido", "República Centro-Africana", "República Checa", "República Dominicana", "República Democrática do Congo", "República do Congo", "Romênia", "Ruanda", "Rússia", "Samoa", "San Marino", "Santa Lúcia", "São Cristóvão e Nevis", "São Tomé e Príncipe", "São Vicente e Granadinas", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Síria", "Sri Lanka", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Timor-Leste", "Togo", "Tonga", "Trinidad e Tobago", "Tunísia", "Turcomenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "Uruguai", "Uzbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Zâmbia", "Zimbábue"
    };
    paisCombo = new JComboBox<>(paises);
    paisCombo.setBounds(120, 140, 200, 25);
    
    // Termos
    
    termosCheck = new JCheckBox("Aceito os termos de uso");
    termosCheck.setBounds(120, 180, 200, 25);
    
    // Botão
    
    enviarButton = new JButton("Enviar");
    enviarButton.setBounds(150, 220, 100, 30);
    
    // Adiciona componentes ao painel
    
    painel.add(nomeLabel);
    painel.add(nomeField);
    painel.add(senhaLabel);
    painel.add(senhaField);
    painel.add(sexoLabel);
    painel.add(mascRadio);
    painel.add(femRadio);
    painel.add(paisLabel);
    painel.add(paisCombo);
    painel.add(termosCheck);
    painel.add(enviarButton);
    painel.add(fdsLabel);
    
    // Configurações do frame

        this.setContentPane(painel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 320);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new FormularioSwing();
    }

}