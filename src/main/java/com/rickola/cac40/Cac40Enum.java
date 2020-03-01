package com.rickola.cac40;

public enum Cac40Enum {

    AC("1rPAC", "ACCOR"),
    AI("1rPAI", "AIR LIQUIDE"),
    AIR("1rPAIR", "AIRBUS"),
    ATO("1rPATO", "ATOS"),
    CS("1rPCS", "AXA"),
    BNP("1rPBNP", "BNP PARIBAS"),
    EN("1rPEN", "BOUYGUES"),
    CAP("1rPCAP", "CAPGEMINI"),
    CA("1rPCA", "CARREFOUR"),
    ACA("1rPACA", "CREDIT AGRICOLE SA"),
    BN("1rPBN", "DANONE"),
    DSY("1rPDSY", "DASSAULT SYSTEMES"),
    ENGI("1rPENGI", "ENGIE"),
    EL("1rPEL", "ESSILORLUXOTT"),
    RMS("1rPRMS", "HERMES INTL"),
    KER("1rPKER", "KERING Ex:PPR"),
    OR("1rPOR", "L'OREAL"),
    LR("1rPLR", "LEGRAND"),
    MC("1rPMC", "LVMH MOET VUITTON"),
    ML("1rPML", "MICHELIN N"),
    ORA("1rPORA", "ORANGE"),
    RI("1rPRI", "PERNOD RICARD"),
    UG("1rPUG", "PEUGEOT"),
    PUB("1rPPUB", "PUBLICIS GRP"),
    RNO("1rPRNO", "RENAULT"),
    AMT("1rAMT", "ARCELORMITTAL"),
    URW("1rAURW", "UNIB-RODAM-WES STPL"),
    SAF("1rPSAF", "SAFRAN"),
    SGO("1rPSGO", "SAINT-GOBAIN"),
    SAN("1rPSAN", "SANOFI"),
    SU("1rPSU", "SCHNEIDER EL"),
    GLE("1rPGLE", "SOCIETE GENERALE"),
    SW("1rPSW", "SODEXO"),
    STM("1rPSTM", "STMICROELECTR"),
    FTI("1rPFTI", "TECHNIPFMC"),
    HO("1rPHO", "THALES"),
    FP("1rPFP", "TOTAL"),
    VIE("1rPVIE", "VEOLIA ENVIRONNEM"),
    DG("1rPDG", "VINCI"),
    VIV("1rPVIV", "VIVENDI"),
    PSP5("1rTPSP5", "Lyxor PEA S&P 500 UCITS ETF - Capi.");

    private String code;
    private String name;

    Cac40Enum(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
