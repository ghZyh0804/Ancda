package com.ancda.parents.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ancda.parents.R;
import com.ancda.parents.model.ParentLoginModel;

import java.util.List;

/**
 * 作者：DELL-002 on 2018/4/27 14:09
 */
public class SelectStudentAdapter extends BaseAdapter {

    private List<ParentLoginModel.DataBean.StudentsBean> studentsBeans;

    public SelectStudentAdapter(List<ParentLoginModel.DataBean.StudentsBean> studentsModel) {
        this.studentsBeans = studentsModel;
    }

    @Override
    public int getCount() {
        if (studentsBeans != null) {
            return studentsBeans.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {

        return studentsBeans.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        ParentLoginModel.DataBean.StudentsBean item = (ParentLoginModel.DataBean.StudentsBean) getItem(position);
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_select_student, null);
            viewHolder.studentName = convertView.findViewById(R.id.textView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.studentName.setText(item.getStudentname());
        return convertView;
    }


    class ViewHolder {
        TextView studentName;

    }

}
