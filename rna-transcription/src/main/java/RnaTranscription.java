class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for (int index = 0; index < dnaStrand.length(); index++) {
            if (dnaStrand.charAt(index) == 'G') {
                rnaStrand.append('C');
            } else if (dnaStrand.charAt(index) == 'C') {
                rnaStrand.append('G');
            } else if (dnaStrand.charAt(index) == 'T') {
                rnaStrand.append('A');
            } else if (dnaStrand.charAt(index) == 'A') {
                rnaStrand.append('U');
            }
        }


        return rnaStrand.toString();
    }

}
