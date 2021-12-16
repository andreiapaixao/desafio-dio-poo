package com.br.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndreia = new Dev();
        devAndreia.setNome("Andreia");
        devAndreia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devAndreia.getNome() + devAndreia.getConteudosInscritos());
        devAndreia.progredir();
        devAndreia.progredir();
        System.out.println("Conteúdos Inscritos de " + devAndreia.getNome() + devAndreia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de " + devAndreia.getNome() + devAndreia.getConteudosConcluidos());
        System.out.println("XP de " + devAndreia.getNome() + ": " + devAndreia.calcularTotalXp());

        System.out.println("----------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devCamila.getNome() + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos de " + devCamila.getNome() + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de " + devCamila.getNome() + devCamila.getConteudosConcluidos());
        System.out.println("XP de " + devCamila.getNome() + ": " + devCamila.calcularTotalXp());




    }
}
