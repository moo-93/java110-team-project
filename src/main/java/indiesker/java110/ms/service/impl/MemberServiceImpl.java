package indiesker.java110.ms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import indiesker.java110.ms.dao.MemberDao;
import indiesker.java110.ms.domain.Member;
import indiesker.java110.ms.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired MemberDao memberDao;
    
    @Override
    public void add(Member member) {
      
      memberDao.insert(member);
    }

    @Override
    public int checkId(String id) {
     
     return memberDao.checkId(id);
    }

    @Override
    public int checkEmail(String email) {
      return memberDao.checkEmail(email);
    }

    @Override
    public int checkNickname(String nickname) {
      return memberDao.checkNickname(nickname);
    }

    @Override
    public Member findNoById(String id) {
      return memberDao.findNoById(id);
    }
    
    
}










