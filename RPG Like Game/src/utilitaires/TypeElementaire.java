package utilitaires;

public enum TypeElementaire {
    FEU, BOIS, EAU, METAL, TERRE;

    public static boolean estDominantSur(TypeElementaire attaquant, TypeElementaire defendeur) {
        switch (attaquant) {
            case BOIS:
                return defendeur == TERRE;
            case FEU:
                return defendeur == METAL;
            case TERRE:
                return defendeur == EAU;
            case METAL:
                return defendeur == BOIS;
            case EAU:
                return defendeur == FEU;
            default:
                return false;
        }
    }
}
