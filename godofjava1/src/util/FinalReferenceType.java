package util;

import model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto=new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType finalReferenceType = new FinalReferenceType();
        finalReferenceType.checkDTO();
    }

    private void checkDTO() {
        System.out.println(dto);
//        dto = new MemberDTO();//Cannot assign a value to final variable 'dto'
        dto.name="SangMin";
        System.out.println(dto);
    }
}
