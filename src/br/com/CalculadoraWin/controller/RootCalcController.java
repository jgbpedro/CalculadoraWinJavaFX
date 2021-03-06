package br.com.CalculadoraWin.controller;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import javafx.scene.text.TextFlow;

public class RootCalcController {
	@FXML
	private TextFlow txtTela;
	@FXML
	private Button btnMR;
	@FXML
	private Button btnMS;
	@FXML
	private Button btnMm;
	@FXML
	private Button btnMmin;
	@FXML
	private Button btnApagar;
	@FXML
	private Button btnDeletar;
	@FXML
	private Button btnC;
	@FXML
	private Button btnInvert;
	@FXML
	private Button btnRaiz;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btnDiv;
	@FXML
	private Button btnPorcentagem;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btnProd;
	@FXML
	private Button btnPor1;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Button btnSub;
	@FXML
	private Button btnPoint;
	@FXML
	private Button btnMC;
	@FXML
	private Button btnSoma;
	@FXML
	private Button btnResultado;
	@FXML
	private Button btn0;
	@FXML
	private Label txtOp;
	@FXML
	private Label txtCalculo;

	String num="";
	private double bloqDigito;
	String porcentagem="";
	double num1;
	double num2;
	String op;


	// Event Listener on Button[#btnMR].onAction
	@FXML
	public void MR(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnMS].onAction
	@FXML
	public void MS(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnMm].onAction
	@FXML
	public void Mm(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnMmin].onAction
	@FXML
	public void Mmin(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnApagar].onAction
	@FXML
	public void Apagar(ActionEvent event) {
		// TODO Autogenerated

		StringBuffer sb = new StringBuffer(num);
		int size = num.length();
		sb.deleteCharAt(size-1);
	    System.out.println(sb);
	    num = String.valueOf(sb);
	    txtCalculo.setText(num);
	}
	// Event Listener on Button[#btnDeletar].onAction
	@FXML
	public void Deletar(ActionEvent event) {
		// TODO Autogenerated
		txtCalculo.setText("0");
		num = "";
	}
	// Event Listener on Button[#btnC].onAction
	@FXML
	public void Zerar(ActionEvent event) {
		// TODO Autogenerated
		txtCalculo.setText("0");
		num = "";
	}
	// Event Listener on Button[#btnInvert].onAction
	@FXML
	public void Inverter(ActionEvent event) {
		// TODO Autogenerated
		if (num.contains("-")){

			num = num.replace("-", "");
			System.out.println(num);
			txtCalculo.setText(num);

		}else{
			System.out.println("N�o cont�m");
			num = "-" + num;
			txtCalculo.setText(num);
		}
	}
	// Event Listener on Button[#btnRaiz].onAction
	@FXML
	public void RaizQ(ActionEvent event) {
		// TODO Autogenerated
		num1 = Double.parseDouble(num);
		double raiz = Math.sqrt(num1);
		num = String.valueOf(raiz);
		txtCalculo.setText(String.valueOf(num));
	}
	// Event Listener on Button[#btn7].onAction
	@FXML
	public void p7(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="7";
			txtCalculo.setText(num);
			}
			else{num+="7";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btn8].onAction
	@FXML
	public void p8(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="8";
			txtCalculo.setText(num);
			}
			else{num+="8";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btn9].onAction
	@FXML
	public void p9(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="9";
			txtCalculo.setText(num);
			}
			else{num+="9";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btnDiv].onAction
	@FXML
	public void Div(ActionEvent event) {
		// TODO Autogenerated
		if (!num.contains("+") || !num.contains("-") || !num.contains("*") || !num.contains("+")){
		num1 = Double.parseDouble(num);
		num+="/";

		txtCalculo.setText(num);
		num = num.replace("/", "");
		op = "/";
		num ="";
		}
		return;
	}
	// Event Listener on Button[#btnPorcentagem].onAction
	@FXML
	public void Porcentagem(ActionEvent event) {
		// TODO Autogenerated
		porcentagem = "%";
	}
	// Event Listener on Button[#btn4].onAction
	@FXML
	public void p4(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="4";
			txtCalculo.setText(num);
			}
			else{num+="4";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btn5].onAction
	@FXML
	public void p5(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="5";
			txtCalculo.setText(num);
			}
			else{num+="5";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btn6].onAction
	@FXML
	public void p6(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="6";
			txtCalculo.setText(num);
			}
			else{num+="6";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btnProd].onAction
	@FXML
	public void Produto(ActionEvent event) {
		// TODO Autogenerated
		if (!num.contains("+") || !num.contains("-") || !num.contains("*") || !num.contains("+")){
		num1 = Double.parseDouble(num);
		num+="*";

		txtCalculo.setText(num);
		num = num.replace("*", "");
		op = "*";
		num ="";
		}return;
	}
	// Event Listener on Button[#btnPor1].onAction
	@FXML
	public void DivPor1(ActionEvent event) {
		// TODO Autogenerated
		num1 = Double.parseDouble(num);
		double divP1 = 1/num1;
		num = String.valueOf(divP1);
		txtCalculo.setText(String.valueOf(num));

	}
	// Event Listener on Button[#btn1].onAction
	@FXML
	public void p1(ActionEvent event) {
		// TODO Autogenerated

		if(bloqDigito > 0){
		num="";
		bloqDigito = 0;
		num+="1";
		txtCalculo.setText(num);
		}
		else{num+="1";
		txtCalculo.setText(num);
		}
	}
	// Event Listener on Button[#btn2].onAction
	@FXML
	public void p2(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="2";
			txtCalculo.setText(num);
			}
			else{num+="2";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btn3].onAction
	@FXML
	public void p3(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="3";
			txtCalculo.setText(num);
			}
			else{num+="3";
			txtCalculo.setText(num);
			}
	}
	// Event Listener on Button[#btnSub].onAction
	@FXML
	public void Subtracao(ActionEvent event) {
		// TODO Autogenerated
		if (!num.contains("+") || !num.contains("-") || !num.contains("*") || !num.contains("+")){
		num1 = Double.parseDouble(num);
		num+="-";

		txtCalculo.setText(num);
		num = num.replace("-", "");
		op = "-";
		num ="";
		}
		return;
	}
	// Event Listener on Button[#btnPoint].onAction
	@FXML
	public void Point(ActionEvent event) {
		// TODO Autogenerated

		System.out.println(num);
		if (!num.contains(".")){

			if(num.equals("") || num.equals("0") || num.equals(null)){
				num+="0";
			}
			System.out.println("N�o Cont�m");
			num+=".";
			txtCalculo.setText(num);
		}
		System.out.println("Cont�m");
	}
	// Event Listener on Button[#btnMC].onAction
	@FXML
	public void MC(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnSoma].onAction
	@FXML
	public void Soma(ActionEvent event) {
		// TODO Autogenerated
		if (!num.contains("+") || !num.contains("-") || !num.contains("*") || !num.contains("+")){
		num1 = Double.parseDouble(num);
		num+="+";

		txtCalculo.setText(num);
		num = num.replace("+", "");
		op = "+";
		num ="";
		}return;
	}
	// Event Listener on Button[#btnResultado].onAction
	@FXML
	public void Resultado(ActionEvent event) {
		// TODO Autogenerated

		System.out.println(Calcular(op, num1));
		porcentagem = "";


	}
	// Event Listener on Button[#btn0].onAction
	@FXML
	public void p0(ActionEvent event) {
		// TODO Autogenerated
		if(bloqDigito > 0){
			num="";
			bloqDigito = 0;
			num+="0";
			txtCalculo.setText(num);
			}
			else{num+="0";
			txtCalculo.setText(num);
			}
	}

	public double Calcular(String operacao, double n1){
		double num2= Double.parseDouble(num);
		double resultado = 0;


		if(porcentagem.equals("%")&& operacao!=""){
			num2 = (num2/100)*num1;
			System.out.println(num2);
			txtCalculo.setText(String.valueOf(num2));

			}

		if(operacao.equals("+")){
			resultado = num1 + num2;
			num = String.valueOf(resultado);
			txtCalculo.setText(String.valueOf(resultado));
		}
		if(operacao.equals("-")){
			resultado = num1 - num2;
			num = String.valueOf(resultado);
			txtCalculo.setText(String.valueOf(resultado));

			}
		if(operacao.equals("*")){
			resultado = num1 * num2;
			num = String.valueOf(resultado);
			txtCalculo.setText(String.valueOf(resultado));

			}
		if(operacao.equals("/")){
			resultado = num1 / num2;
			num = String.valueOf(resultado);
			txtCalculo.setText(String.valueOf(resultado));

			}


		bloqDigito = resultado;
		System.out.println(bloqDigito);
		num2 = 0;
		porcentagem = "";
		return resultado;
	}

}
