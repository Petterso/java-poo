package poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Aluno a1 = new Aluno();
		a1.setCpf(Long.valueOf(123456));
		a1.setMatricula(Long.valueOf(123456));
		a1.setNome("a");
		a1.setDataNasc(LocalDate.of(2022, 1, 15));
		Aluno a2 = new Aluno();
		a2.setCpf(Long.valueOf(23456));
		a2.setMatricula(Long.valueOf(5769475));
		a2.setNome("b");
		Aluno a3 = new Aluno();
		a3.setCpf(321l);
		a3.setMatricula(321l);
		a3.setNome("c");
		Professor p1=new Professor();
		p1.setCpf(1l);
		p1.setNome("sdkap");
		p1.setSiape(3l);
		Professor p2=new Professor();
		p2.setCpf(1l);
		p2.setNome("sdkap");
		p2.setSiape(3l);
		Professor p3=new Professor();
		p3.setCpf(1l);
		p3.setNome("sdkap");
		p3.setSiape(3l);
		
	}

}
