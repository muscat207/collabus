package com.collabus.service;

import java.util.List;

import com.collabus.model.InviteDTO;

public interface MypageService {
   
   public int inviteAccept(int user_id,int project_id) throws Exception;
   
   public int projectMamber(int work_user,int work_project) throws Exception;
   
   public void inviteReject(int user_id , int project_id) throws Exception;

   public List<InviteDTO> userinviteselects(int user_id) throws Exception;

   public int pwdUpdate(String user_pw, int user_id);
}
