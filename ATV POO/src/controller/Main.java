package controller;

import java.util.Scanner;

import model.Departamento;
import model.Empresa;
import model.Estrutura;
import model.Funcionario;
import model.Setor;

public class Main {

	public static void main(String[] args) {
		
		//Funcionaio
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNomePes("Gabriel Lima");
		funcionario1.setDataNascimento("18/12/2001");
		funcionario1.setCpf("192.168.010-10");
		funcionario1.setCodigoFunc(101);
		funcionario1.setProfissao("Operador de Maquina");
		funcionario1.setCargaHoraria("42h semanais");
		funcionario1.setSalarioFunc(1500f);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNomePes("Steve Jobs");
		funcionario2.setDataNascimento("20/10/1891");
		funcionario2.setCpf("000.000.000-01");
		funcionario2.setCodigoFunc(102);
		funcionario2.setProfissao("Programador");
		funcionario2.setCargaHoraria("42h semanais");
		funcionario2.setSalarioFunc(3000f);
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNomePes("Jubileu");
		funcionario3.setDataNascimento("16/04/1999");
		funcionario3.setCpf("255.255.255-01");
		funcionario3.setCodigoFunc(103);
		funcionario3.setProfissao("Arquiteto de Software");
		funcionario3.setCargaHoraria("42h semanais");
		funcionario3.setSalarioFunc(7700f);
		
		Funcionario funcionario4 = new Funcionario();
		funcionario4.setNomePes("Juliana");
		funcionario4.setDataNascimento("16/04/1996");
		funcionario4.setCpf("200.200.200-01");
		funcionario4.setCodigoFunc(104);
		funcionario4.setProfissao("Gerente de RH");
		funcionario4.setCargaHoraria("42h semanais");
		funcionario4.setSalarioFunc(6000f);
		
		
		//Setor
		Setor setor = new Setor();
		setor.Pessoas.add(funcionario1);
		setor.Pessoas.add(funcionario2);
		setor.Pessoas.add(funcionario3);
		setor.Pessoas.add(funcionario4);
		setor.contar();
		
		Setor setor1 = new Setor();
		setor1.setDescricaoSetor("Carregamento");
		setor1.setCodigoSetor(0202);
		setor1.Pessoas.add(funcionario1);
		
		Setor setor2 = new Setor();
		setor2.setDescricaoSetor("Front-end");
		setor2.setCodigoSetor(0303);
		setor2.Pessoas.add(funcionario2);
		
		
		//Departamento
		Departamento departamento3 = new Departamento();
		departamento3.setDescricao("Recursos Humanos");
		departamento3.setCodigo(1010);
		departamento3.Setores.add(setor1);
		departamento3.Setores.add(setor2);

		departamento3.contar();
		
		Departamento departamento1 = new Departamento();
		departamento1.setDescricao("Transporte e Logistica");
		departamento1.setCodigo(2020);
		departamento1.Setores.add(setor1);
		
		Departamento departamento2 = new Departamento();
		departamento2.setDescricao("Area de Programacao");
		departamento2.setCodigo(3030);
		departamento2.Setores.add(setor2);

		
		
		//Estrutura
		Estrutura estrutura = new Estrutura();
		estrutura.setNomeEst("Padrao ABD");
		estrutura.setCodigoEst(1013);
		estrutura.Departamentos.add(departamento1);
		estrutura.Departamentos.add(departamento2);
		estrutura.Departamentos.add(departamento3);
		estrutura.contar();
		
		
		//Empresa
		Empresa empresa = new Empresa();
		empresa.setNome("Aquila");
		empresa.setEndereco("Av. Paulista, 1340");
		empresa.setCnpj("10.100.101/0001-01");
		
		

		//Style
		System.out.println("==================================================================================================");
		System.out.println("===                                        A Q U I L A                                         ===");
		System.out.println("===      Endereco: "+empresa.getEndereco()+"                      CNPJ: "+empresa.getCnpj()+"            ===");
		System.out.println("==================================================================================================");
		System.out.println("===                                                                                            ===");
		System.out.println("===     1. ESTRUTURA      2. DEPARTAMENTOS      3. SETOR      4. FUNCIONARIOS      5. EXIT     ===");
		System.out.println("===                                                                                            ===");
		System.out.println("==================================================================================================");
		
		try (Scanner ler = new Scanner(System.in)) {
			int valor = 0;
			while(valor != 6) {
				valor = ler.nextInt();
				
				switch(valor) {
				case 1:
					System.out.println("======================================= E S T R U T U R A ========================================");
					System.out.println("===       Nome: "+estrutura.getNomeEst()+"                                                  Codigo: "+estrutura.getCodigoEst()+"       ===");
					System.out.println("===     ----------------------------------------------------------------------------------     ===");
					System.out.println("===       Quantidade de Departamentos: "+estrutura.valor+"                                                       ===");
					System.out.println("===       Quantidade de Setores: "+departamento3.valor+"                                                             ===");
					System.out.println("===       Quantidade de Funcionarios: "+setor.valor+"                                                        ===");
					System.out.println("==================================================================================================");
					break;
	
				case 2:
					System.out.println("=================================== D E P A R T A M E N T O S ====================================");
					System.out.println("===       Quantidade de Departamentos: "+estrutura.valor+"                                                       ===");
					System.out.println("===     ----------------------------------------------------------------------------------     ===");
					System.out.println("===       Departamento: "+departamento3.getDescricao()+"                         Codigo: "+departamento3.getCodigo()+"                  ===");
					System.out.println("===       Departamento: "+departamento1.getDescricao()+"                   Codigo: "+departamento1.getCodigo()+"                  ===");
					System.out.println("===       Departemento: "+departamento2.getDescricao()+"                      Codigo: "+departamento2.getCodigo()+"                  ===");
					System.out.println("==================================================================================================");
					break;
					
				case 3:
					System.out.println("=========================================== S E T O R ============================================");
					System.out.println("===       Quantidade de Setores: "+departamento3.valor+"                                                             ===");
					System.out.println("===     ----------------------------------------------------------------------------------     ===");
					System.out.println("===       Descricao: "+setor1.getDescricaoSetor()+"                              Codigo: "+setor1.getCodigoSetor()+"                     ===");
					System.out.println("===       Descricao: "+setor2.getDescricaoSetor()+"                                 Codigo: "+setor2.getCodigoSetor()+"                     ===");
					System.out.println("==================================================================================================");
					break;
					
				case 4:
					System.out.println("==================================== F U N C I O N A R I O S =====================================");
					System.out.println("===       Quantidade de Funcionarios: "+setor.valor+"                                                        ===");
					System.out.println("===     ----------------------------------------------------------------------------------     ===");
					System.out.println("===       Nome: "+funcionario1.getNomePes()+"                                  Codigo: "+funcionario1.getCodigoFunc()+"                      ===");
					System.out.println("===       Data de Nascimento: "+funcionario1.getDataNascimento()+"                      CPF: "+funcionario1.getCpf()+"              ===");
					System.out.println("===       Profissao: "+funcionario1.getProfissao()+"                      Carga horaria: "+funcionario1.getCargaHoraria()+"      ===");
					System.out.println("===       Salario: "+funcionario1.getSalarioFunc()+"                                                                      ===");
					System.out.println("===     ----------------------------------------------------------------------------------     ===");
					System.out.println("===       Nome: "+funcionario2.getNomePes()+"                                    Codigo: "+funcionario2.getCodigoFunc()+"                      ===");
					System.out.println("===       Data de Nascimento: "+funcionario2.getDataNascimento()+"                      CPF: "+funcionario2.getCpf()+"              ===");
					System.out.println("===       Profissao: "+funcionario2.getProfissao()+"                              Carga horaria: "+funcionario2.getCargaHoraria()+"      ===");
					System.out.println("===       Salario: "+funcionario2.getSalarioFunc()+"                                                                      ===");
					System.out.println("===     ----------------------------------------------------------------------------------     ===");
					System.out.println("===       Nome: "+funcionario3.getNomePes()+"                                       Codigo: "+funcionario3.getCodigoFunc()+"                      ===");
					System.out.println("===       Data de Nascimento: "+funcionario3.getDataNascimento()+"                      CPF: "+funcionario3.getCpf()+"              ===");
					System.out.println("===       Profissao: "+funcionario3.getProfissao()+"                    Carga horaria: "+funcionario3.getCargaHoraria()+"      ===");
					System.out.println("===       Salario: "+funcionario3.getSalarioFunc()+"                                                                      ===");
					System.out.println("===     ----------------------------------------------------------------------------------     ===");
					System.out.println("===       Nome: "+funcionario4.getNomePes()+"                                       Codigo: "+funcionario4.getCodigoFunc()+"                      ===");
					System.out.println("===       Data de Nascimento: "+funcionario4.getDataNascimento()+"                      CPF: "+funcionario4.getCpf()+"              ===");
					System.out.println("===       Profissao: "+funcionario4.getProfissao()+"                            Carga horaria: "+funcionario4.getCargaHoraria()+"      ===");
					System.out.println("===       Salario: "+funcionario4.getSalarioFunc()+"                                                                      ===");
					System.out.println("==================================================================================================");
					break;
					
				case 5:
					System.out.println("");
					System.out.println("                             ---       Programa Encerrado       ---                             ");
					System.exit(0);
					
				default: System.out.println("                             ---         Opcao Invalido         ---");
				valor = 0;
				}
			}
		}
	}
}
