package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class aqw extends a {
    public int efm;
    public LinkedList<aqu> mQk = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.efm);
            aVar.d(2, 8, this.mQk);
            return 0;
        } else if (i == 1) {
            return (a.a.a.a.dS(1, this.efm) + 0) + a.a.a.a.c(2, 8, this.mQk);
        } else {
            byte[] bArr;
            if (i == 2) {
                bArr = (byte[]) objArr[0];
                this.mQk.clear();
                a.a.a.a.a aVar2 = new a.a.a.a.a(bArr, unknownTagHandler);
                for (int a = a.a(aVar2); a > 0; a = a.a(aVar2)) {
                    if (!super.a(aVar2, this, a)) {
                        aVar2.bQL();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
                aqw com_tencent_mm_protocal_c_aqw = (aqw) objArr[1];
                int intValue = ((Integer) objArr[2]).intValue();
                switch (intValue) {
                    case 1:
                        com_tencent_mm_protocal_c_aqw.efm = aVar3.pMj.mH();
                        return 0;
                    case 2:
                        LinkedList zQ = aVar3.zQ(intValue);
                        int size = zQ.size();
                        for (intValue = 0; intValue < size; intValue++) {
                            bArr = (byte[]) zQ.get(intValue);
                            a com_tencent_mm_protocal_c_aqu = new aqu();
                            a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                            for (boolean z = true; z; z = com_tencent_mm_protocal_c_aqu.a(aVar4, com_tencent_mm_protocal_c_aqu, a.a(aVar4))) {
                            }
                            com_tencent_mm_protocal_c_aqw.mQk.add(com_tencent_mm_protocal_c_aqu);
                        }
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
