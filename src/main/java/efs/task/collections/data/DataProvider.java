package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {

        List<Town> towns = new ArrayList<>();
        for (String townData : Data.baseTownsArray) {
            String[] townInfo = townData.split(DATA_SEPARATOR);
            String townName = townInfo[0].trim();
            String hero1 = townInfo[1].trim();
            String hero2 = townInfo[2].trim();
            Town town = new Town(townName, List.of(hero1, hero2));
            towns.add(town);
        }
        return towns;

    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {

        List<Town> towns = new ArrayList<>();
        for (String townData : Data.dlcTownsArray) {
            String[] townInfo = townData.split(DATA_SEPARATOR);
            String townName = townInfo[0].trim();
            String hero1 = townInfo[1].trim();
            String hero2 = townInfo[2].trim();
            Town town = new Town(townName,List.of(hero1, hero2));
            towns.add(town);
        }
        return towns;

    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroes = new HashSet<>();
        for (String heroData : Data.baseCharactersArray) {
            String[] heroInfo = heroData.split(DATA_SEPARATOR);
            String heroName = heroInfo[0].trim();
            String heroClass = heroInfo[1].trim();
            Hero hero = new Hero(heroName, heroClass);
            heroes.add(hero);
        }
        return heroes;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> heroes = new HashSet<>();
        for (String heroData : Data.dlcCharactersArray) {
            String[] heroInfo = heroData.split(DATA_SEPARATOR);
            String heroName = heroInfo[0].trim();
            String heroClass = heroInfo[1].trim();
            Hero hero = new Hero(heroName, heroClass);
            heroes.add(hero);
        }
        return heroes;
    }
}
