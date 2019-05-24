package com.company;

// Lukasz Rachwal S19638
// Maciej Rybacki S18553
public class Main {

    public static void main(String[] args) {
        ChemicalElement hydrogen = new ChemicalElement("Hydrogen", "H", 1, null);
        ChemicalElement oxygenium = new ChemicalElement("Oxygenium", "O", 8, null);

        ChemicalElement lithium = new ChemicalElement("Lithium", "Li", 3, ChemicalElement.Type.ALKALI);
        ChemicalElement sodium = new ChemicalElement("Sodium", "Na", 11, ChemicalElement.Type.ALKALI);
        ChemicalElement pottassium = new ChemicalElement("Pottassium", "K", 19, ChemicalElement.Type.ALKALI);
        ChemicalElement rubidium = new ChemicalElement("Rubidium", "Rb", 37, ChemicalElement.Type.ALKALI);
        ChemicalElement caesium = new ChemicalElement("Caesium", "Cs", 55, ChemicalElement.Type.ALKALI);
        ChemicalElement francium = new ChemicalElement("Francium", "Fr", 87, ChemicalElement.Type.ALKALI);

        ChemicalElement scandium = new ChemicalElement("Scandium", "Sc", 21, ChemicalElement.Type.TRANSITION);
        ChemicalElement titanium = new ChemicalElement("Titanium", "Ti", 22, ChemicalElement.Type.TRANSITION);
        ChemicalElement vanadium = new ChemicalElement("Vanadium", "V", 23, ChemicalElement.Type.TRANSITION);
        ChemicalElement chromium = new ChemicalElement("Chromium", "Cr", 24, ChemicalElement.Type.TRANSITION);
        ChemicalElement manganese = new ChemicalElement("Manganese", "Mn", 25, ChemicalElement.Type.TRANSITION);
        ChemicalElement iron = new ChemicalElement("Iron", "Fe", 26, ChemicalElement.Type.TRANSITION);
        ChemicalElement cobalt = new ChemicalElement("Cobalt", "Co", 27, ChemicalElement.Type.TRANSITION);
        ChemicalElement nickel = new ChemicalElement("Nickel", "Ni", 28, ChemicalElement.Type.TRANSITION);
        ChemicalElement copper = new ChemicalElement("Copper", "Cu", 29, ChemicalElement.Type.TRANSITION);
        ChemicalElement zinc = new ChemicalElement("Zinc", "Zn", 30, ChemicalElement.Type.TRANSITION);
        ChemicalElement gallium = new ChemicalElement("Gallium", "Ga", 31, ChemicalElement.Type.TRANSITION);
        ChemicalElement yttrium = new ChemicalElement("Yttrium", "Y", 39, ChemicalElement.Type.TRANSITION);
        ChemicalElement zirconium = new ChemicalElement("Zirconium", "Zr", 40, ChemicalElement.Type.TRANSITION);
        ChemicalElement niobium = new ChemicalElement("Niobium", "Nb", 41, ChemicalElement.Type.TRANSITION);
        ChemicalElement molybdenum = new ChemicalElement("Molybdenum", "Mo", 42, ChemicalElement.Type.TRANSITION);
        ChemicalElement technetium = new ChemicalElement("Technetium", "Tc", 43, ChemicalElement.Type.TRANSITION);
        ChemicalElement ruthenium = new ChemicalElement("Ruthenium", "Ru", 44, ChemicalElement.Type.TRANSITION);
        ChemicalElement rhodium = new ChemicalElement("Rhodium", "Rh", 45, ChemicalElement.Type.TRANSITION);
        ChemicalElement palladium = new ChemicalElement("Palladium", "Pd", 46, ChemicalElement.Type.TRANSITION);
        ChemicalElement silver = new ChemicalElement("Silver", "Ag", 47, ChemicalElement.Type.TRANSITION);
        ChemicalElement cadmium = new ChemicalElement("Cadmium", "Cd", 48, ChemicalElement.Type.TRANSITION);
        ChemicalElement hafnium = new ChemicalElement("Hafnium", "Hf", 72, ChemicalElement.Type.TRANSITION);
        ChemicalElement tantalum = new ChemicalElement("Tantalum", "Ta", 73, ChemicalElement.Type.TRANSITION);
        ChemicalElement tungsten = new ChemicalElement("Tungsten", "W", 74, ChemicalElement.Type.TRANSITION);
        ChemicalElement rhenium = new ChemicalElement("Rhenium", "Re", 75, ChemicalElement.Type.TRANSITION);
        ChemicalElement osmium = new ChemicalElement("Osmium", "Os", 76, ChemicalElement.Type.TRANSITION);
        ChemicalElement iridium = new ChemicalElement("Iridium", "Ir", 77, ChemicalElement.Type.TRANSITION);
        ChemicalElement platinum = new ChemicalElement("Platinum", "Pt", 78, ChemicalElement.Type.TRANSITION);
        ChemicalElement gold = new ChemicalElement("Gold", "Au", 79, ChemicalElement.Type.TRANSITION);
        ChemicalElement mercury = new ChemicalElement("Mercury", "Hg", 80, ChemicalElement.Type.TRANSITION);
        ChemicalElement rutherfordium = new ChemicalElement("Rutherfordium", "Rf", 104, ChemicalElement.Type.TRANSITION);
        ChemicalElement dubnium = new ChemicalElement("Dubnium", "Db", 105, ChemicalElement.Type.TRANSITION);
        ChemicalElement seaborgium = new ChemicalElement("Seaborgium", "Sg", 106, ChemicalElement.Type.TRANSITION);
        ChemicalElement bohrium = new ChemicalElement("Bohrium", "Bh", 107, ChemicalElement.Type.TRANSITION);
        ChemicalElement hassium = new ChemicalElement("Hassium", "Hs", 108, ChemicalElement.Type.TRANSITION);
        ChemicalElement meitnerium = new ChemicalElement("Meitnerium", "Mt", 109, ChemicalElement.Type.TRANSITION);
        ChemicalElement darmstadtium = new ChemicalElement("Darmstadtium", "Ds", 110, ChemicalElement.Type.TRANSITION);
        ChemicalElement roentgenium = new ChemicalElement("Roentgenium", "Rg", 111, ChemicalElement.Type.TRANSITION);
        ChemicalElement copernicium = new ChemicalElement("Copernicium", "Cn", 112, ChemicalElement.Type.TRANSITION);

        ChemicalElement aluminium = new ChemicalElement("Aluminium", "Al", 13, ChemicalElement.Type.METAL);
        ChemicalElement indium = new ChemicalElement("Indium", "In", 49, ChemicalElement.Type.METAL);
        ChemicalElement tin = new ChemicalElement("Tin", "Sn", 50, ChemicalElement.Type.METAL);
        ChemicalElement thallium = new ChemicalElement("Thallium", "Tl", 81, ChemicalElement.Type.METAL);
        ChemicalElement lead = new ChemicalElement("Lead", "Pb", 82, ChemicalElement.Type.METAL);
        ChemicalElement bismuth = new ChemicalElement("Bismuth", "Bi", 83, ChemicalElement.Type.METAL);
        ChemicalElement nihonium = new ChemicalElement("Nihonium", "Nh", 113, ChemicalElement.Type.METAL);
        ChemicalElement flerovium = new ChemicalElement("Flerovium", "Fl", 114, ChemicalElement.Type.METAL);
        ChemicalElement moscovium = new ChemicalElement("Moscovium", "Mc", 115, ChemicalElement.Type.METAL);
        ChemicalElement livermorium = new ChemicalElement("Livermorium", "Lv", 116, ChemicalElement.Type.METAL);

        System.out.println("Name: " + bohrium.getName());
        System.out.println("Atomic Number: " + bohrium.getAtomicNumber());
        System.out.println("Alkali Metal: " + bohrium.isAlkaliMetal());
        System.out.println("Transition Metal: " + bohrium.isTransitionMetal());
        System.out.println("Metal: " + bohrium.isMetal());
    }
}

