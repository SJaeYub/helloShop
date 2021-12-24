package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) {            //1개(단건) 조회
        return em.find(Member.class, id);
    }

    public List<Member> findAll() {                 //모든 회원 정보를 리스트 형태로 리턴
        return em.createQuery("select m from Member as m", Member.class)
                .getResultList();
    }

    public List<Member> findByName(String name) {   //회원 name을 통한 회원 조회
        return em.createQuery("select m from Member as m where m.name =:name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
