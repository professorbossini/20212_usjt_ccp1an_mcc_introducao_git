public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();

        e1.setTipo(1);
        e2.setTipo(2);
        e3.setTipo(3);

        e1.setSalario(2500);
        e2.setSalario(1700);
        e2.setComissao(0.3);
        e3.setSalario(1800);
        e3.setBonus(500);

        System.out.println(e1.calcularSalario());
        System.out.println(e2.calcularSalario());
        System.out.println(e3.calcularSalario());
        System.out.println ("Terminando..");
    }   
}
