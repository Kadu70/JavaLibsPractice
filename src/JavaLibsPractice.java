import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Enter your name");
        String strMsg ="o Aluno " + name;
        int intDia = 0;
        int intMes = 0;
        int intAno =0;
        int intTotalDias =0;       
        double douTotalPassagem = 0;        
        double douPassagem = 0;        
        int intDias = 0;        
        int intHorasDias = 0;
        double douCorte=0;
        double douFreq=0;
        String strCurso="";
        String strNasc="";
        String strSemana="";
        
        
        intDia =  Integer.parseInt((String)JOptionPane.showInputDialog(null,
                "Que dia Voce Nasceu?",
                "Senai",
                2,
                null,
                null,
                ""));
        
        intMes =  Integer.parseInt((String)JOptionPane.showInputDialog(null,
                "Qual o Mes de Nascimento?",
                "Senai",
                2,
                null,
                null,
                ""));
        
        intAno =  Integer.parseInt((String)JOptionPane.showInputDialog(null,
                "E o Ano?",
                "Senai",
                2,
                null,
                null,
                ""));
        
        strNasc = "" + intDia +"/"+ intMes +"/"+ intAno;
        strMsg += "\nque nasceu em " + strNasc; 
        
                       
        String[] strCursos = {"Java", "Logica", "Excel"};
        
        strCurso =(String)JOptionPane.showInputDialog(null,
                "Qual o Curso?",
                "Senai",
                2,
                null,
                strCursos,
                strCursos[0]);
                
        strMsg += "\nesta cursando o curso de " + strCurso;
        
        intDias =  Integer.parseInt((String)JOptionPane.showInputDialog(null,
                "Qual Duração em Dias?",
                "Senai",
                2,
                null,
                null,
                ""));
        
        strMsg += "\nque sera feito em " + intDias + " dias";
                
        intHorasDias =  Integer.parseInt((String)JOptionPane.showInputDialog(null,
                "Quantas Horas por Dia?",
                "Senai",
                2,
                null,
                null,
                ""));
        
        
        
        intTotalDias = intHorasDias * intDias;
        
        strMsg += "\nsendo " + intHorasDias + "h, por dia" ;
        
        douPassagem =  Double.parseDouble((String)JOptionPane.showInputDialog(null,
                "Qual o Valor da Passagem?",
                "Senai",
                2,
                null,
                null,
                ""));
        
               
        douTotalPassagem = (douPassagem*2) * intTotalDias;    
        
        strMsg += "\no valor da passagem por dia é: R$ " + (douPassagem*2) + ", total geral de R$ " + douTotalPassagem;
        
        intHorasDias =  Integer.parseInt((String)JOptionPane.showInputDialog(null,
                "Quantas Horas por Dia?",
                "Senai",
                2,
                null,
                null,
                ""));
        
        intTotalDias = intHorasDias * intDias;
        
        strMsg += "\ntotal de horas do curso " + intTotalDias +"h";
        
        douCorte =  Double.parseDouble((String)JOptionPane.showInputDialog(null,
                "Qual Frequencia minima?",
                "Senai",
                2,
                null,
                null,
                ""));
        
        douFreq = intTotalDias * (douCorte/100) ;
        
        strMsg += "\nsendo a frequencia minima de " + douFreq + "h";
        
         JOptionPane.showMessageDialog(null,
               strMsg,
                "Senai",
                0);

    }   
}