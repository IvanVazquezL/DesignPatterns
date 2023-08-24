package StrategyExercise;

import StrategyExercise.Character.*;
import StrategyExercise.Character.Character;
import StrategyExercise.Weapon.AxeBehavior;
import StrategyExercise.Weapon.BowAndArrowBehavior;
import StrategyExercise.Weapon.KnifeBehavior;
import StrategyExercise.Weapon.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        King king = new King(new SwordBehavior());
        Queen queen = new Queen(new BowAndArrowBehavior());
        Knight knight = new Knight(new KnifeBehavior());
        Troll troll = new Troll(new AxeBehavior());
        characterAttacks(king);
        characterAttacks(queen);
        characterAttacks(knight);
        characterAttacks(troll);
    }

    public static void characterAttacks(Character character) {
        character.fight();
    }
}
