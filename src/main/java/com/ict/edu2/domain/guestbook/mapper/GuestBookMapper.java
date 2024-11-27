package com.ict.edu2.domain.guestbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ict.edu2.domain.guestbook.vo.GuestBookVO;

// mapper.xml에 알아서 간다.
@Mapper
public interface GuestBookMapper {
    // 메소드 이름이 id라 하심 method = id
    // 간단한 sql 처리 가능 => 여기서 발전된 게 JPA 라고 하심
    @Select("select * from guestbook order by gb_idx")
    public List<GuestBookVO> getGuestBookList();

    // xml에 가려면 메서드 이름이 id가 된다.
    public GuestBookVO getGuestBookDetail(String gb_idx);
}
