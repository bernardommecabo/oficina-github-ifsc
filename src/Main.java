import calc.Calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultadoSoma = calc.somar(2,2);
        int resultadoSubtracao = calc.subtrair(2,2);
        int resultadosMult = calc.multiplicar(2,2);
        float resultadoDvisao = calc.dividir(2,2);

        System.out.println("Resultado da soma " + resultadoSoma);
        System.out.println("Resultado da subtracao " + resultadoSubtracao);
        System.out.println("Resultado da multiplicacao " + resultadosMult);
        System.out.println("Resultado da divisao " + resultadoDvisao);

    }
}