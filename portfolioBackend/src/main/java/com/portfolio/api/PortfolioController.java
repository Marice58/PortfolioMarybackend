package com.portfolio.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PortfolioController {

    @GetMapping("/portfolio")
    public Portfolio getPortfolio() {
        // Create a new instance of Portfolio and populate it with data
        Portfolio portfolio = new Portfolio();
        portfolio.setTitle("Marys Rocca");
        portfolio.setAbout("Because there is always time to start again, I am a Civil Engineer with extensive experience in project management and control, administrative processes, construction, maintenance, and restoration of civil works. Now, I am exploring the IT world with a disciplined and methodical approach to learn and add new skills.");

        // Populate experienceList
        List<Experience> experienceList = new ArrayList<>();
        experienceList.add(new Experience("Specialist Administrator", "C.A. Metro de Caracas", "1987-2008"));
        experienceList.add(new Experience("Specialist Administrator", "Metro Los Teques", "2008-2010"));
        experienceList.add(new Experience("Ingeniero III, Program and Control Unit Manager", "Otepi Consultores, S.A.", "1991-1992"));
        portfolio.setExperienceList(experienceList);

        // Set education
        portfolio.setEducation("Universidad Central de Venezuela, Caracas, Venezuela | Ingeniero Civil | January/1983");

        // Populate trainingList
        List<Training> trainingList = new ArrayList<>();
        trainingList.add(new Training("Java Orientado a Objetos", "Oracle-ONE + Alura Latam", "March/23"));
        trainingList.add(new Training("Emprendimiento", "Oracle-ONE + Alura Latam", "March/23"));
        trainingList.add(new Training("Front-End Web Development", "freeCodeCamp", "January/22"));
        portfolio.setTrainingList(trainingList);

        // Populate skillsList
        List<Skill> skillsList = new ArrayList<>();
        skillsList.add(new Skill("HTML", "90%"));
        skillsList.add(new Skill("CSS", "80%"));
        skillsList.add(new Skill("JavaScript", "70%"));
        portfolio.setSkillsList(skillsList);

        return portfolio;
    }
}